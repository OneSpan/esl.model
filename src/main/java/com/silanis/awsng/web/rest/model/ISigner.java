package com.silanis.awsng.web.rest.model;
//
import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.silanis.awsng.web.rest.util.JsonDateDeserializer;
import com.silanis.awsng.web.rest.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.silanis.awsng.web.rest.util.SchemaSanitizer;
public interface ISigner extends IUser{
    public ISigner setAddress( Address value);
    public Address getAddress();
    public ISigner setAuth( Auth value);
    public Auth getAuth();
    public ISigner setCompany( String value);
    public String getCompany();
    public ISigner setCreated( java.util.Date value);
    public java.util.Date getCreated();
    public ISigner setData( Map<String, Object> value);
    public Map<String, Object> getData();
    public ISigner setDelivery( Delivery value);
    public Delivery getDelivery();
    public ISigner setEmail( String value);
    public String getEmail();
    public ISigner setExternal( External value);
    public External getExternal();
    public ISigner setFirstName( String value);
    public String getFirstName();
    public ISigner setId( String value);
    public String getId();
    public ISigner setLanguage( String value);
    public String getLanguage();
    public ISigner setLastName( String value);
    public String getLastName();
    public ISigner setName( String value);
    public String getName();
    public ISigner setPhone( String value);
    public String getPhone();
    public ISigner setSignature( SignatureStyle value);
    public SignatureStyle getSignature();
    public ISigner setTitle( String value);
    public String getTitle();
    public ISigner setUpdated( java.util.Date value);
    public java.util.Date getUpdated();
    }