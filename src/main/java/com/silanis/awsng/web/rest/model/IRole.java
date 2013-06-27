package com.silanis.awsng.web.rest.model;
//
import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.silanis.awsng.web.rest.util.SchemaSanitizer;
public interface IRole extends IEntity{
    public IRole setData( Map<String, Object> value);
    public Map<String, Object> getData();
    public IRole setEmailMessage( BaseMessage value);
    public BaseMessage getEmailMessage();
    public IRole setId( String value);
    public String getId();
    public IRole setIndex( Integer value);
    public Integer getIndex();
    public IRole setLocked( Boolean value);
    public Boolean getLocked();
    public IRole setName( String value);
    public String getName();
    public IRole setReassign( Boolean value);
    public Boolean getReassign();
    public IRole setSigners( List<Signer> value);
    public List<Signer> getSigners();
    public IRole setType( RoleType value);
    public RoleType getType();
    }