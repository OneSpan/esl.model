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
@JsonIgnoreProperties(ignoreUnknown=true)
public class Sender extends User
      implements java.io.Serializable, ISender
{
    
    // Dirty Flag Constants
    @JsonIgnore
    public static final String FIELD_ACCOUNT = "account";
    @JsonIgnore
    public static final String FIELD_ACTIVATED = "activated";
    @JsonIgnore
    public static final String FIELD_ADDRESS = "address";
    @JsonIgnore
    public static final String FIELD_COMPANY = "company";
    @JsonIgnore
    public static final String FIELD_CREATED = "created";
    @JsonIgnore
    public static final String FIELD_DATA = "data";
    @JsonIgnore
    public static final String FIELD_EMAIL = "email";
    @JsonIgnore
    public static final String FIELD_EXTERNAL = "external";
    @JsonIgnore
    public static final String FIELD_FIRSTNAME = "firstName";
    @JsonIgnore
    public static final String FIELD_ID = "id";
    @JsonIgnore
    public static final String FIELD_LANGUAGE = "language";
    @JsonIgnore
    public static final String FIELD_LASTNAME = "lastName";
    @JsonIgnore
    public static final String FIELD_LOCKED = "locked";
    @JsonIgnore
    public static final String FIELD_NAME = "name";
    @JsonIgnore
    public static final String FIELD_PHONE = "phone";
    @JsonIgnore
    public static final String FIELD_SIGNATURE = "signature";
    @JsonIgnore
    public static final String FIELD_STATUS = "status";
    @JsonIgnore
    public static final String FIELD_TITLE = "title";
    @JsonIgnore
    public static final String FIELD_TYPE = "type";
    @JsonIgnore
    public static final String FIELD_UPDATED = "updated";
    
    // Empty Constructor
    public Sender ( ) {}
    
    // Fields
    protected Account _account = null;
    protected java.util.Date _activated = null;
    protected java.util.Date _locked = null;
    protected SenderStatus _status = SenderStatus.INVITED;
    protected SenderType _type = SenderType.REGULAR;
    
    // Accessors
        
    
    public Sender setAccount( Account value ){
        // TODO With proper compare
        // if ( this._account == value ) return this;
        this._account = value;
        setDirty(FIELD_ACCOUNT);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetAccount( Account value ){
        if ( value != null ) { this.setAccount( value ); }
        return this;
    }
    public Account getAccount(){
        return _account;
    }
    
        
    
    @JsonDeserialize(using = JsonDateDeserializer.class)
    public Sender setActivated( java.util.Date value ){
        // TODO With proper compare
        // if ( this._activated == value ) return this;
        this._activated = value;
        setDirty(FIELD_ACTIVATED);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetActivated( java.util.Date value ){
        if ( value != null ) { this.setActivated( value ); }
        return this;
    }
    @JsonSerialize(using = JsonDateSerializer.class)
    public java.util.Date getActivated(){
        return _activated;
    }
    
        
    
    @Override
    public Sender setAddress( Address value ){
        super.setAddress(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetAddress( Address value ){
        if ( value != null ) { this.setAddress( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setCompany( String value ){
        super.setCompany(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetCompany( String value ){
        if ( value != null ) { this.setCompany( value ); }
        return this;
    }
    
        
    
    @JsonDeserialize(using = JsonDateDeserializer.class)
    @Override
    public Sender setCreated( java.util.Date value ){
        super.setCreated(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetCreated( java.util.Date value ){
        if ( value != null ) { this.setCreated( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setData( Map<String, Object> value ){
        super.setData(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetData( Map<String, Object> value ){
        if ( value != null ) { this.setData( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setEmail( String value ){
        super.setEmail(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetEmail( String value ){
        if ( value != null ) { this.setEmail( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setExternal( External value ){
        super.setExternal(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetExternal( External value ){
        if ( value != null ) { this.setExternal( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setFirstName( String value ){
        super.setFirstName(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetFirstName( String value ){
        if ( value != null ) { this.setFirstName( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setId( String value ){
        super.setId(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetId( String value ){
        if ( value != null ) { this.setId( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setLanguage( String value ){
        super.setLanguage(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetLanguage( String value ){
        if ( value != null ) { this.setLanguage( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setLastName( String value ){
        super.setLastName(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetLastName( String value ){
        if ( value != null ) { this.setLastName( value ); }
        return this;
    }
    
        
    
    @JsonDeserialize(using = JsonDateDeserializer.class)
    public Sender setLocked( java.util.Date value ){
        // TODO With proper compare
        // if ( this._locked == value ) return this;
        this._locked = value;
        setDirty(FIELD_LOCKED);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetLocked( java.util.Date value ){
        if ( value != null ) { this.setLocked( value ); }
        return this;
    }
    @JsonSerialize(using = JsonDateSerializer.class)
    public java.util.Date getLocked(){
        return _locked;
    }
    
        
    
    @Override
    public Sender setName( String value ){
        super.setName(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetName( String value ){
        if ( value != null ) { this.setName( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setPhone( String value ){
        super.setPhone(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetPhone( String value ){
        if ( value != null ) { this.setPhone( value ); }
        return this;
    }
    
        
    
    @Override
    public Sender setSignature( SignatureStyle value ){
        super.setSignature(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetSignature( SignatureStyle value ){
        if ( value != null ) { this.setSignature( value ); }
        return this;
    }
    
        
    
    public Sender setStatus( SenderStatus value ){
        SchemaSanitizer.throwOnNull(FIELD_STATUS,value);
        // TODO With proper compare
        // if ( this._status == value ) return this;
        this._status = value;
        setDirty(FIELD_STATUS);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetStatus( SenderStatus value ){
        if ( value != null ) { this.setStatus( value ); }
        return this;
    }
    public SenderStatus getStatus(){
        return _status;
    }
    
        
    
    @Override
    public Sender setTitle( String value ){
        super.setTitle(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetTitle( String value ){
        if ( value != null ) { this.setTitle( value ); }
        return this;
    }
    
        
    
    public Sender setType( SenderType value ){
        SchemaSanitizer.throwOnNull(FIELD_TYPE,value);
        // TODO With proper compare
        // if ( this._type == value ) return this;
        this._type = value;
        setDirty(FIELD_TYPE);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetType( SenderType value ){
        if ( value != null ) { this.setType( value ); }
        return this;
    }
    public SenderType getType(){
        return _type;
    }
    
        
    
    @JsonDeserialize(using = JsonDateDeserializer.class)
    @Override
    public Sender setUpdated( java.util.Date value ){
        super.setUpdated(value);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Sender safeSetUpdated( java.util.Date value ){
        if ( value != null ) { this.setUpdated( value ); }
        return this;
    }
    
    
}