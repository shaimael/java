package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationReferenceBuilder extends io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluentImpl<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder>{
  public V1beta2PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference build() {
    V1beta2PriorityLevelConfigurationReference buildable = new V1beta2PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2PriorityLevelConfigurationReferenceBuilder that = (V1beta2PriorityLevelConfigurationReferenceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}