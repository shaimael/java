package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2CrossVersionObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2CrossVersionObjectReference,io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder>{
  public V2CrossVersionObjectReferenceBuilder() {
    this(false);
  }
  public V2CrossVersionObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
    this(new V2CrossVersionObjectReference(), validationEnabled);
  }
  public V2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2CrossVersionObjectReference(), validationEnabled);
  }
  public V2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }
  public V2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance) {
    this(instance,false);
  }
  public V2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference build() {
    V2CrossVersionObjectReference buildable = new V2CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2CrossVersionObjectReferenceBuilder that = (V2CrossVersionObjectReferenceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}