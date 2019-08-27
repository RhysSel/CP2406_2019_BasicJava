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

    @Test
    public void testInput() {

        FitnessTracker initial = new FitnessTracker("skipping", 10, "2/2/2019");
        assertEquals(initial.getActivity(), "skipping");
        assertEquals(initial.getParticipationTime(), 10);
        assertEquals(initial.getDate(), "2/2/2019");
    }
}