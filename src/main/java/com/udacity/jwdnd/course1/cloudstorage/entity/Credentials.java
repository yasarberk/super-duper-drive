package com.udacity.jwdnd.course1.cloudstorage.entity;

import lombok.Data;

@Data
public class Credentials {
    private Integer credentialid;
    private String url;
    private String username;
    private String key;
    private String password;
    private Integer userid;

}
