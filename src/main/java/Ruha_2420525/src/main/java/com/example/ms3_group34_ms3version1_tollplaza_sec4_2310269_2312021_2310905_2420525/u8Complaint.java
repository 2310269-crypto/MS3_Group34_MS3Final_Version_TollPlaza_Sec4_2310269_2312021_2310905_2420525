package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;



    public class u8Complaint {

        private String name;
        private String number;
        private String tollTransactionID;
        private String details;
        private String date;

        public u8Complaint(String name, String number, String tollTransactionID, String details, String date) {
            this.name = name;
            this.number = number;
            this.tollTransactionID = tollTransactionID;
            this.details = details;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public String getNumber() {
            return number;
        }

        public String getTollTransactionID() {
            return tollTransactionID;
        }

        public String getDetails() {
            return details;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Complaint{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    ", tollTransactionID='" + tollTransactionID + '\'' +
                    ", details='" + details + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }
    }

