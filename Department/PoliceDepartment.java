class PoliceDepartment extends Department {
    int departmentSize;

    public PoliceDepartment(int departmentSize) {
        this.departmentSize=departmentSize;

    }
    @Override
    int getDepartmentSize() {
        return departmentSize;
    }
}
