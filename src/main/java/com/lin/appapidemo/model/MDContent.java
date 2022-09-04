package com.lin.appapidemo.model;


import java.util.Date;

public class MDContent {

    private String noteId;
    private String title;
    private boolean isProtected;
    private String type;
    private String mime;
    private boolean isDeleted;
    private Date dateCreated;
    private Date dateModified;
    private Date utcDateCreated;
    private Date utcDateModified;
    private String content;
    private int contentLength;
    private Date combinedUtcDateModified;
    private Date combinedDateModified;

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIsProtected(boolean isProtected) {
        this.isProtected = isProtected;
    }

    public boolean getIsProtected() {
        return isProtected;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getMime() {
        return mime;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setUtcDateCreated(Date utcDateCreated) {
        this.utcDateCreated = utcDateCreated;
    }

    public Date getUtcDateCreated() {
        return utcDateCreated;
    }

    public void setUtcDateModified(Date utcDateModified) {
        this.utcDateModified = utcDateModified;
    }

    public Date getUtcDateModified() {
        return utcDateModified;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setCombinedUtcDateModified(Date combinedUtcDateModified) {
        this.combinedUtcDateModified = combinedUtcDateModified;
    }

    public Date getCombinedUtcDateModified() {
        return combinedUtcDateModified;
    }

    public void setCombinedDateModified(Date combinedDateModified) {
        this.combinedDateModified = combinedDateModified;
    }

    public Date getCombinedDateModified() {
        return combinedDateModified;
    }

}
