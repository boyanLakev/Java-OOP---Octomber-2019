import interfaces.LieutenantGeneral;
import interfaces.Private;

import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<Private> soldier;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.soldier = new ArrayList<>();

    }

    @Override
    public void addPrivate(Private priv) {
        this.soldier.add(priv);
    }
}
