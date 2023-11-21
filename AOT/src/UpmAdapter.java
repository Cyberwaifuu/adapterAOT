class UPMAdapter implements Horse {
    UPM upm;

    public UPMAdapter(UPM upm) {
        this.upm = upm;
    }

    @Override
    public void moveOnHorse() {
        upm.move();
    }

    @Override
    public void attackOnHorse() {
        upm.attack();
    }

    @Override
    public void dodgeRightOnHorse() {
        upm.dodgeRight();
    }

    @Override
    public void dodgeLeftOnHorse() {
        upm.dodgeLeft();
    }
}