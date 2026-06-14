package Interview_prep_2025;

interface Interface_sample {
    //can't have a constructor
    // it can only have the method definition,but it doesn't provide the implementation
    void eat();
    void sleep();
    default int action() {
        return 4;
    }

    static void main(String[] args) {
        Interface_sample s = new Interface_sample() {
            @Override
            public void eat() {
                System.out.println("ate");
            }

            @Override
            public void sleep() {
                System.out.println("Slept");
            }

            @Override
            public int action() {
                return 5;
            }
        };
    }
}
