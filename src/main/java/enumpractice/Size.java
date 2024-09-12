package enumpractice;

enum Size {
    S("Small size"),
    M("Medium size"),
    L("Large size"),
    XL("Extralarge size");

    private String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
