package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.util.Collection;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerStatusFluent<A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items);
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionBuilder> predicate);
  public A addToCurrentMetrics(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item);
  public A setToCurrentMetrics(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item);
  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items);
  public A addAllToCurrentMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2MetricStatus> items);
  public A removeFromCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items);
  public A removeAllFromCurrentMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2MetricStatus> items);
  public A removeMatchingFromCurrentMetrics(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildCurrentMetrics instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2MetricStatus> getCurrentMetrics();
  public java.util.List<io.kubernetes.client.openapi.models.V2MetricStatus> buildCurrentMetrics();
  public io.kubernetes.client.openapi.models.V2MetricStatus buildCurrentMetric(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2MetricStatus buildFirstCurrentMetric();
  public io.kubernetes.client.openapi.models.V2MetricStatus buildLastCurrentMetric();
  public io.kubernetes.client.openapi.models.V2MetricStatus buildMatchingCurrentMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate);
  public java.lang.Boolean hasMatchingCurrentMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate);
  public A withCurrentMetrics(java.util.List<io.kubernetes.client.openapi.models.V2MetricStatus> currentMetrics);
  public A withCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... currentMetrics);
  public java.lang.Boolean hasCurrentMetrics();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetricLike(io.kubernetes.client.openapi.models.V2MetricStatus item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> setNewCurrentMetricLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricStatus item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editCurrentMetric(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editFirstCurrentMetric();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editLastCurrentMetric();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editMatchingCurrentMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricStatusBuilder> predicate);
  public java.lang.Integer getCurrentReplicas();
  public A withCurrentReplicas(java.lang.Integer currentReplicas);
  public java.lang.Boolean hasCurrentReplicas();
  public java.lang.Integer getDesiredReplicas();
  public A withDesiredReplicas(java.lang.Integer desiredReplicas);
  public java.lang.Boolean hasDesiredReplicas();
  public java.time.OffsetDateTime getLastScaleTime();
  public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime);
  public java.lang.Boolean hasLastScaleTime();
  public java.lang.Long getObservedGeneration();
  public A withObservedGeneration(java.lang.Long observedGeneration);
  public java.lang.Boolean hasObservedGeneration();
  public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerConditionFluent<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface CurrentMetricsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2MetricStatusFluent<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>>{
    public N and();
    public N endCurrentMetric();
    
  }
  
}