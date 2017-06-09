package com.flock.model;

import com.flock.model.Error;
import com.flock.model.ChannelMember;
import java.util.*;


public class ListMembersOptionalParams {

    private Boolean showPublicProfile = null;

    public ListMembersOptionalParams showPublicProfile(Boolean showPublicProfile) {
        this.showPublicProfile = showPublicProfile;
        return this;
    }

    public Boolean getShowPublicProfile() {
        return showPublicProfile;
    }

    public void setShowPublicProfile(Boolean showPublicProfile) {
        this.showPublicProfile = showPublicProfile;
    }
}