# javaflock
javaflock is a java client for [FlockOS](https://docs.flock.co/).

## Installation
[![](https://jitpack.io/v/com.flock/javaflock.svg)](https://jitpack.io/#com.flock/javaflock)
### Maven
Add the JitPack repository to your build file
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
Add the dependency
```xml
<dependency>
    <groupId>com.flock</groupId>
    <artifactId>javaflock</artifactId>
    <version>v1.1</version>
</dependency>
```
### Gradle
Add the JitPack repository to your root build.gradle
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Add the dependency
```groovy
dependencies {
	compile 'com.flock:javaflock:v1.1'
}
```

## Usage

## Index

  - [Methods](#methods)
  - [Handling events](#handling-events)
  - [Verifying event tokens](#verifying-event-token)

## [Methods](https://docs.flock.co/display/flockos/Methods)

#### Send a simple message
```java
UidResponse messageId = Chat.sendMessage("token", "<to>", "<message>", null);
```

#### Sending message asynchronously
```java
ListenableFuture<UidResponse> future = Chat.sendMessageAsync("token", "<to>", "<message>", null);
```

#### Send a message using a custom name and profile image
```java
SendAs sendAs = new SendAs().name("HAL-9000").profileImage("https://pbs.twimg.com/profile_images/1788506913/HAL-MC2_400x400.png");
Chat.sendMessage("token", "<to>", "<message>", new SendMessageOptionalParams().sendAs(sendAs));
```

#### Send a widget view
```java
WidgetView widget = new WidgetView().src("http://example.com").height(250);
Views views = new Views().widget(widget);
Attachment attachment = new Attachment().title("Test widget").description("<description>").views(views);
// NOTE: attachments is a list of attachments
Chat.sendMessage("<token>", "<to>", "<message>", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Send a HTML view
```java
HtmlView htmlView = new HtmlView().inline("A valid <b>html</b> here").height(50);
Views views = new Views().html(htmlView);
Attachment attachment = new Attachment().title("Test html").description("<description>").views(views);
Chat.sendMessage("<token>", "<to>", "<message>", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Send a FlockML view
```java
Views views = new Views().flockml("<flockml>FlockML is <b>AWESOME</b></flockml>");
Attachment attachment = new Attachment().title("Test flockml").description("<description>").views(views);
Chat.sendMessage("<token>", "<to>", "<message>", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Send a Image view
```java
Image image = new Image().src("http://library.acropolis.org/wp-content/uploads/2014/11/One_ring.png").width(400).height(400);
ImageView imageView = new ImageView().original(image).filename("onering.png");
Views views = new Views().image(imageView)
Attachment attachment = new Attachment().title("Test imageview").description("<description>").views(views);
Chat.sendMessage("<token>", "<to>", "<message>", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Send download files
```java
AttachmentDownload attachmentDownload = new AttachmentDownload().src("http://wallpapercave.com/wp/H630T6R.jpg");
Views views = new Views().flockml("<flockml>Download the <i>matrix</i></flockml>")
// NOTE: downloads is always a list
Attachment attachment = new Attachment().title("Test file").downloads(Collections.singletonList(attachmentDownload)).views(views);
Chat.sendMessage("<token>", "<to>", "<message>", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Button with openwidget, open url & send to app service
```java
AttachmentButton b1 = new AttachmentButton().name("Harry Potter").id("harry").action(new ActionConfig().type("openWidget").url("https://goo.gl/aygRGf").desktopType("sidebar"));
AttachmentButton b2 = new AttachmentButton().name("Ron Weasley").id("ron").action(new ActionConfig().type("openBrowser").url("https://goo.gl/gDpMVn").sendContext(true));
AttachmentButton b3 = new AttachmentButton().name("Hermione Granger").id("hermione").action(new ActionConfig().type("sendEvent"));
Attachment attachment = new Attachment().title("Test buttons").buttons(Arrays.asList(b1,b2,b3));
Chat.sendMessage("<token>", "<to>", "Who is your favourite Harry Potter character?", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Now, just for fun, let us change colours
```java
Attachment attachment = new Attachment().title("Test colour").color("#FF0000").description("It is red!");
Chat.sendMessage("<token>", "<to>", "<message>", new SendMessageOptionalParams().attachments(Collections.singletonList(attachment)));
```

#### Fetching messages
```java
Message[] messages = Chat.fetchMessages("<token>", "<chat>", uids);
```

### Group APIs

#### Get group info
```java
Group group = Groups.getInfo("<token>", groupId);
```

#### Get group members
```java
PublicProfile[] members = Groups.getMembers("<token>", groupId);
```

#### Get groups list of which user is member of 
```java
Group[] groupList = Groups.list("<token>");
```

### User APIs

#### Get user info
```java
User userInfo = Users.getInfo("<token>");
```

#### Get user's public profile
```java
User userInfo = Users.getPublicProfile("<token>", userId);
```

### Contact APIs
#### Get all contacts
```java
PublicProfile[] contacts = Roster.listContacts("<token>");
```


## Handling [events](https://docs.flock.co/display/flockos/Events)
Create instance of `EventHandlerClient`
```java
EventHandlerClient client = new EventHandlerClient("<appID>", "<appSecret>");
```
Attach `eventListeners` with the client (these will be fired when an event occurs) 
```java
client.setAppInstallListener(event -> {
	// handle app install event here
});
client.setClientSlashCommandListener(event -> {
    // handle slash command event here
    ...
    // return the response for the event
    return new ToastMessage().text("<toast message to be shown>");
});
```
Attach `eventHandlerClient` with your web framework by calling `client.handleRequest` when event request is received
```java
HttpServletResponse response = client.handleRequest(request, response);
```


## Verifying [event token](http://docs.flock.co/display/flockos/Event+Tokens)
```java
TokenVerifier tokenVerifier = new TokenVerifier("<appId>", "<appSecret>");
boolean isTokenVerified = tokenVerifier.verifyToken("<eventToken>", "<userId>");
```
