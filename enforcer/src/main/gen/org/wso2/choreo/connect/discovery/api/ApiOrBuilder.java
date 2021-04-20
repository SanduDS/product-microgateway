// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/api.proto

package org.wso2.choreo.connect.discovery.api;

public interface ApiOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.api.Api)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string apiType = 4;</code>
   * @return The apiType.
   */
  java.lang.String getApiType();
  /**
   * <code>string apiType = 4;</code>
   * @return The bytes for apiType.
   */
  com.google.protobuf.ByteString
      getApiTypeBytes();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .wso2.discovery.api.Endpoint productionUrls = 6;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.Endpoint> 
      getProductionUrlsList();
  /**
   * <code>repeated .wso2.discovery.api.Endpoint productionUrls = 6;</code>
   */
  org.wso2.choreo.connect.discovery.api.Endpoint getProductionUrls(int index);
  /**
   * <code>repeated .wso2.discovery.api.Endpoint productionUrls = 6;</code>
   */
  int getProductionUrlsCount();
  /**
   * <code>repeated .wso2.discovery.api.Endpoint productionUrls = 6;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.EndpointOrBuilder> 
      getProductionUrlsOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.Endpoint productionUrls = 6;</code>
   */
  org.wso2.choreo.connect.discovery.api.EndpointOrBuilder getProductionUrlsOrBuilder(
      int index);

  /**
   * <code>repeated .wso2.discovery.api.Endpoint sandboxUrls = 7;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.Endpoint> 
      getSandboxUrlsList();
  /**
   * <code>repeated .wso2.discovery.api.Endpoint sandboxUrls = 7;</code>
   */
  org.wso2.choreo.connect.discovery.api.Endpoint getSandboxUrls(int index);
  /**
   * <code>repeated .wso2.discovery.api.Endpoint sandboxUrls = 7;</code>
   */
  int getSandboxUrlsCount();
  /**
   * <code>repeated .wso2.discovery.api.Endpoint sandboxUrls = 7;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.EndpointOrBuilder> 
      getSandboxUrlsOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.Endpoint sandboxUrls = 7;</code>
   */
  org.wso2.choreo.connect.discovery.api.EndpointOrBuilder getSandboxUrlsOrBuilder(
      int index);

  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.Resource> 
      getResourcesList();
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  org.wso2.choreo.connect.discovery.api.Resource getResources(int index);
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  int getResourcesCount();
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.ResourceOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.Resource resources = 8;</code>
   */
  org.wso2.choreo.connect.discovery.api.ResourceOrBuilder getResourcesOrBuilder(
      int index);

  /**
   * <code>string basePath = 9;</code>
   * @return The basePath.
   */
  java.lang.String getBasePath();
  /**
   * <code>string basePath = 9;</code>
   * @return The bytes for basePath.
   */
  com.google.protobuf.ByteString
      getBasePathBytes();

  /**
   * <code>string tier = 10;</code>
   * @return The tier.
   */
  java.lang.String getTier();
  /**
   * <code>string tier = 10;</code>
   * @return The bytes for tier.
   */
  com.google.protobuf.ByteString
      getTierBytes();

  /**
   * <code>string apiLifeCycleState = 11;</code>
   * @return The apiLifeCycleState.
   */
  java.lang.String getApiLifeCycleState();
  /**
   * <code>string apiLifeCycleState = 11;</code>
   * @return The bytes for apiLifeCycleState.
   */
  com.google.protobuf.ByteString
      getApiLifeCycleStateBytes();

  /**
   * <code>repeated string securityScheme = 12;</code>
   * @return A list containing the securityScheme.
   */
  java.util.List<java.lang.String>
      getSecuritySchemeList();
  /**
   * <code>repeated string securityScheme = 12;</code>
   * @return The count of securityScheme.
   */
  int getSecuritySchemeCount();
  /**
   * <code>repeated string securityScheme = 12;</code>
   * @param index The index of the element to return.
   * @return The securityScheme at the given index.
   */
  java.lang.String getSecurityScheme(int index);
  /**
   * <code>repeated string securityScheme = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the securityScheme at the given index.
   */
  com.google.protobuf.ByteString
      getSecuritySchemeBytes(int index);

  /**
   * <code>.wso2.discovery.api.EndpointSecurity endpointSecurity = 13;</code>
   * @return Whether the endpointSecurity field is set.
   */
  boolean hasEndpointSecurity();
  /**
   * <code>.wso2.discovery.api.EndpointSecurity endpointSecurity = 13;</code>
   * @return The endpointSecurity.
   */
  org.wso2.choreo.connect.discovery.api.EndpointSecurity getEndpointSecurity();
  /**
   * <code>.wso2.discovery.api.EndpointSecurity endpointSecurity = 13;</code>
   */
  org.wso2.choreo.connect.discovery.api.EndpointSecurityOrBuilder getEndpointSecurityOrBuilder();

  /**
   * <code>string authorizationHeader = 14;</code>
   * @return The authorizationHeader.
   */
  java.lang.String getAuthorizationHeader();
  /**
   * <code>string authorizationHeader = 14;</code>
   * @return The bytes for authorizationHeader.
   */
  com.google.protobuf.ByteString
      getAuthorizationHeaderBytes();

  /**
   * <code>bool disableSecurity = 15;</code>
   * @return The disableSecurity.
   */
  boolean getDisableSecurity();

  /**
   * <code>string vhost = 16;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <code>string vhost = 16;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <code>string organizationId = 17;</code>
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   * <code>string organizationId = 17;</code>
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString
      getOrganizationIdBytes();
}
