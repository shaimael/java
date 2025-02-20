package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerStatusBuilder extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluentImpl<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusBuilder>{
  public V2HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withCurrentMetrics(instance.getCurrentMetrics());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withDesiredReplicas(instance.getDesiredReplicas());

    fluent.withLastScaleTime(instance.getLastScaleTime());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withCurrentMetrics(instance.getCurrentMetrics());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus build() {
    V2HorizontalPodAutoscalerStatus buildable = new V2HorizontalPodAutoscalerStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentMetrics(fluent.getCurrentMetrics());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerStatusBuilder that = (V2HorizontalPodAutoscalerStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}