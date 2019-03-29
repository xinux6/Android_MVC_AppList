package com.justinsmith.applist;

public class AppModel {
    private int id;
    private String app_name;
    private float app_version;
    private String domain_name;
    private String contact_email;
    private String image_url;

    public AppModel(int id, String app_name, float app_version, String domain_name, String contact_email, String image_url) {
        this.id = id;
        this.app_name = app_name;
        this.app_version = app_version;
        this.domain_name = domain_name;
        this. contact_email = contact_email;
        this.image_url = image_url;
    }

    public int getId(){
        return id;
    }

    public String getAppName(){
        return app_name;
    }

    public float getAppVersion(){
        return app_version;
    }

    public String getDomainName(){
        return domain_name;
    }

    public String getContactEmail(){
        return contact_email;
    }

    public String getImageUrl(){
        return image_url;
    }


}
