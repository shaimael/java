package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2ResourceMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2ResourceMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2ResourceMetricStatus,io.kubernetes.client.openapi.models.V2ResourceMetricStatusBuilder>{
  public V2ResourceMetricStatusBuilder() {
    this(false);
  }
  public V2ResourceMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2ResourceMetricStatus(), validationEnabled);
  }
  public V2ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2ResourceMetricStatus(), validationEnabled);
  }
  public V2ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2ResourceMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2ResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricStatus instance) {
    this(instance,false);
  }
  public V2ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2ResourceMetricStatus build() {
    V2ResourceMetricStatus buildable = new V2ResourceMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ResourceMetricStatusBuilder that = (V2ResourceMetricStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}