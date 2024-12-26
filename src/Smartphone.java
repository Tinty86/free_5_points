class Smartphone {
    public String model;
    public String producing_company;
    public boolean is_Global;
    public boolean is_Flagman;

    public Smartphone(Builder smartphone) {
        this.model = smartphone.model;
        this.producing_company = smartphone.producing_company;
        this.is_Global = smartphone.is_Global;
        this.is_Flagman = smartphone.is_Flagman;
    }

    public static class Builder {
        private String model;
        private String producing_company;
        private boolean is_Global;
        private boolean is_Flagman;
        public Builder(String model, String producing_company) {
            this.model = model;
            this.producing_company = producing_company;
        }
        public Builder setGlobal(boolean is_Global) {
            this.is_Global = is_Global;
            return this;
        }
        public Builder setFlagman(boolean is_Flagman) {
            this.is_Flagman = is_Flagman;
            return this;
        }
        public Smartphone build() {
            return new Smartphone(this);
        }
    }
}

