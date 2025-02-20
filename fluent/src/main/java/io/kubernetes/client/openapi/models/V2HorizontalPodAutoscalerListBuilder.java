package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerListBuilder extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluentImpl<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListBuilder>{
  public V2HorizontalPodAutoscalerListBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerListBuilder(java.lang.Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList build() {
    V2HorizontalPodAutoscalerList buildable = new V2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerListBuilder that = (V2HorizontalPodAutoscalerListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}