
   abstract class Animal {
        private double ParamRun;
        private double ParamSwim;
        private double ParamJump;

        Animal(double limitRun, double limitSwim, double limitJump) {
            this.ParamRun = limitRun;
            this.ParamSwim = limitSwim;
            this.ParamJump = limitJump;
        }

        public boolean run(double distance){
            return distance <= ParamRun;
        }

        public boolean swim(double distance){
            return distance <= ParamSwim;
        }
        public boolean jump(double height){
            return height <= ParamJump;
        }

        // task 5
        public void setLimitRun(double limitRun) {
            this.ParamRun = limitRun;
        }

        public void setLimitSwim(double limitSwim) {
            this.ParamSwim = limitSwim;
        }

        public void setLimitJump(double limitJump) {
            this.ParamJump = limitJump;
        }
    }

    class Cat extends Animal {
        Cat() {
            super(200, -1, 2);
        }
    }

    class Dog extends Animal {
        Dog() {
            super(500, 10, 0.5);
        }
    }

