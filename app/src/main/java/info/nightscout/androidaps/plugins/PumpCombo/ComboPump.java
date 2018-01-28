package info.nightscout.androidaps.plugins.PumpCombo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import de.jotomo.ruffyscripter.BasalProfile;
import de.jotomo.ruffyscripter.PumpState;
import de.jotomo.ruffyscripter.history.Bolus;
import de.jotomo.ruffyscripter.history.PumpAlert;
import de.jotomo.ruffyscripter.history.Tdd;

class ComboPump {
    boolean initialized = false;
    volatile long lastSuccessfulCmdTime;

    public volatile String activity;
    @NonNull
    volatile PumpState state = new PumpState();
    volatile int reservoirLevel = -1;
    @NonNull
    volatile BasalProfile basalProfile = new BasalProfile();
    @Nullable
    volatile Bolus lastBolus;

    // Alert and TDD histories are not stored in DB, but are read on demand and just cached  here
    List<PumpAlert> errorHistory = new ArrayList<>(0);
    List<Tdd> tddHistory = new ArrayList<>(0);
}
