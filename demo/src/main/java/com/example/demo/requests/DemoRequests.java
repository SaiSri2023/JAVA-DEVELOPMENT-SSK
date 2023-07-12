package com.example.demo.requests;

public class DemoRequests {

        private String name;

        public DemoRequests(String name) {
            this.name = name;
        }

        public DemoRequests() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "DemoRequests{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
