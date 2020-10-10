package com.raj.nexusrunner;

public class Glass<T extends LiquidService> {
        private T liquid;

        public Glass(T liquid) {
            this.liquid=liquid;
        }

        public void getQuantity()
        {
            this.liquid.getQauntity();
        }

}
