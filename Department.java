abstract class Department {
    abstract int getDepartmentSize();
}
class SubDepartment extends Department {
    private int size;

    // Implementation of abstract method
    @Override
    int getDepartmentSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
