package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FitnessTrackerTest {

    @Test
    public void defaultConstructor() {
        FitnessTracker Default = new FitnessTracker();
        assertEquals(Default.getActivity(), "running");
        assertEquals(Default.getParticipationTime(), 0);
        assertEquals(Default.getDate(), "1/1/2019");
    }

    public void initialValueConstructor() {
        FitnessTracker Input = new FitnessTracker();
        assertEquals(Input.getActivity(), "skipping");
        assertEquals(Input.getParticipationTime(), 10);
        assertEquals(Input.getDate(), "2/2/2019");
    }
}