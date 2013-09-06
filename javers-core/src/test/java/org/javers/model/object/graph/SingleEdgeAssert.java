package org.javers.model.object.graph;

import org.fest.assertions.api.AbstractAssert;
import org.javers.test.assertion.Assertions;
import org.javers.test.assertion.NodeAssert;

/**
 * @author bartosz walacik
 */
public class SingleEdgeAssert extends AbstractAssert<SingleEdgeAssert, SingleEdge> {

    private SingleEdgeAssert(SingleEdge actual) {
        super(actual, SingleEdgeAssert.class);
    }

    public static SingleEdgeAssert assertThat(SingleEdge actual) {
        return new SingleEdgeAssert(actual);
    }

    public SingleEdgeAssert refersToCdoWithId(Object expectedCdoId) {
        Assertions.assertThat(actual.getReference()).isNotNull();

        Assertions.assertThat(actual.getReference().getCdoId()).isEqualTo(expectedCdoId);
        return this;
    }

    public NodeAssert refersToNodeWhich() {
        Assertions.assertThat(actual.getReference()).isNotNull();

        return NodeAssert.assertThat(actual.getReference());
    }
}
