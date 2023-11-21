class VME implements UPM {
    @Override
    public void move() {
        System.out.println("Move on UPM(VME)...");
    }

    @Override
    public void attack() {
        System.out.println("Attack on UPM(VME)...");
    }

    @Override
    public void dodgeRight() {
        System.out.println("Dodge Right on UPM(VME)...");
    }

    @Override
    public void dodgeLeft() {
        System.out.println("Dodge Left on UPM(VME)...");
    }
}