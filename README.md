# flockapiSDK
Flock Api SDK is wrapper over the apis written in Java.

<p>Download the JAR directly from  	
https://s3.amazonaws.com/flock-apps-public/flockapiSDKJava/co.flock.www-1.0-SNAPSHOT.jar </p>


You need to have the user token from the Flock.To start with you need to initalize the FlockApiClient.
```

FlockApiClient flockApiClient = new FlockApiClient(USERTOKEN); 
```
 
 The simplest message you can send in the flock using Message object
 //To can be either the user or group you want to send the message.User can only send message to the group he is member of.<br/>
 ```
Message message = new Message(TO,"Hello Flock");
String messageId = flockApiClient.chatSendMessage(message);
 ```
 To get all the groups of the user
```
Group[] groups = flockApiClient.getGroupList();
```
To get the user info
```
User user = flockApiClient.getUserInfo();
```
To get the roaster of the user
```
PublicProfile[] members = flockApiClient.getRoasterListContacts();
```
In case you want to send the FlockML you can use message property
 ```
message.setFlockml("FLOCK ML WILL GO HERE"); 
 ```
For sending the message along with the attachement with inline html
 ```
 Attachment flockAttachment = new Attachment();
// Need to create a view that will associated with the attachement
View flockAttachementView = new View();
//View can have html , image , widget and FlockML
HtmlView flockHtmlView = new HtmlView();
flockHtmlView.setHeight(height);
flockHtmlView.setInline("Any valid html can go <b>here</b>.");
flockAttachementView.setHtml(flockHtmlView);
 ```
 <p>Image View as attachment</p>
 
 ```
Image iconImage = new Image();
iconImage.setHeight(50);
iconImage.setWidth(50);
iconImage.setSrc("IMAGE URL");
ImageView flockImageView = new ImageView();
flockImageView.setOriginal(iconImage);
flockAttachementView.setImage(flockImageView);
```
<p>We can send very rich Flock Message like ToDo which has the inline message and custom button open the side bar</p>
```
Message message = new Message(to,text);
HtmlView htmlView = new HtmlView();
htmlView.setInline(previewMessage)
htmlView.setHeight(frameHeight);
        
Image iconImage = new Image();
iconImage.setHeight(50);
iconImage.setWidth(50);
iconImage.setSrc("IMAGE URL");
ImageView imagesView = new ImageView(iconImage);
//Action we want to attach to the attachment button in this case open the sidebar on the desktop and modal in mobile
Action viewAction = new Action();
viewAction.addOpenWidget("ANY VALID URL","sidebar","modal");
//View Button
Button[] buttons = new Button[1];
Button viewButton = new Button();
viewButton.setAction(viewAction);
viewButton.setName("View");
buttons[0] = viewButton;

Attachment[] attachments = new Attachment[1];
Attachment attachment = new Attachment();
attachment.setTitle(title);
attachment.setButtons(buttons);
attachment.setAppId("APPID OF YOUR APP");
View view = new View();
view.setHtml(htmlView);
view.setImages(imagesView);
attachment.setViews(view);
attachments[0] = attachment;
message.setAttachments(attachments);
String messageId = flockApiClient.chatSendMessage(message);
  ```
<p>Message showing the widget in the chat window for example Poll</p>
  ```
Message message = new Message(to,text);
WidgetView widgetView = new WidgetView();
widgetView.setSrc("ANY URL OPEN AS WIDGET");
widgetView.setHeight("WIDGET HEIGHT");

Action viewAction = new Action();
viewAction.addOpenWidget(sourceURL,"modal","modal");
//View Button
Button[] buttons = new Button[1];
Button viewButton = new Button();
viewButton.setAction(viewAction);
viewButton.setName("View");
buttons[0] = viewButton;
//Download button 
Download downloadResult = new Download();
downloadResult.setSrc("DOWN LOAD URL");
downloadResult.setFilename("File Name");
downloadResult.setMime("MIME TYPE");

Attachment[] attachments = new Attachment[1];
Attachment attachment = new Attachment();
attachment.setTitle(title);
attachment.setButtons(buttons);
attachment.setDownloads(new Download[]{downloadResult});

View view = new View();
view.setWidget(widgetView);
view.setImages(imageView);


attachment.setViews(view);
attachment.setAppId("APP ID");
attachments[0] = attachment;


message.setAttachments(attachments);
message.setAppId("APP ID");
message.setNotification("THIS IS NOTIFICATION");
String messageId = flockApiClient.chatSendMessage(message);
```
