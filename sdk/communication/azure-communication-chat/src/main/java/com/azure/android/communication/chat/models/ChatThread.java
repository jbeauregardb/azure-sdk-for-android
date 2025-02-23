// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.models;

import com.azure.android.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * The ChatThread model.
 */
@Fluent
public final class ChatThread {
    /*
     * Chat thread id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Chat thread topic.
     */
    @JsonProperty(value = "topic", required = true)
    private String topic;

    /*
     * The timestamp when the chat thread was created. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "createdOn", required = true)
    private OffsetDateTime createdOn;

    /*
     * Id of the chat thread owner.
     */
    @JsonProperty(value = "createdBy", required = true)
    private String createdBy;

    /*
     * The timestamp when the chat thread was deleted. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "deletedOn")
    private OffsetDateTime deletedOn;

    /**
     * Get the id property: Chat thread id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Chat thread id.
     *
     * @param id the id value to set.
     * @return the ChatThread object itself.
     */
    public ChatThread setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the topic property: Chat thread topic.
     *
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: Chat thread topic.
     *
     * @param topic the topic value to set.
     * @return the ChatThread object itself.
     */
    public ChatThread setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the createdOn property: The timestamp when the chat thread was
     * created. The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: The timestamp when the chat thread was
     * created. The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param createdOn the createdOn value to set.
     * @return the ChatThread object itself.
     */
    public ChatThread setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the createdBy property: Id of the chat thread owner.
     *
     * @return the createdBy value.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: Id of the chat thread owner.
     *
     * @param createdBy the createdBy value to set.
     * @return the ChatThread object itself.
     */
    public ChatThread setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the deletedOn property: The timestamp when the chat thread was
     * deleted. The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the deletedOn value.
     */
    public OffsetDateTime getDeletedOn() {
        return this.deletedOn;
    }

    /**
     * Set the deletedOn property: The timestamp when the chat thread was
     * deleted. The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param deletedOn the deletedOn value to set.
     * @return the ChatThread object itself.
     */
    public ChatThread setDeletedOn(OffsetDateTime deletedOn) {
        this.deletedOn = deletedOn;
        return this;
    }
}
