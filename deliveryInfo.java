public class deliveryInfo extends User {


        String Address;

        String phoneNum;
        String ETA;

        public deliveryInfo(String Name, String Address, String phoneNum, String ETA){
            super();

            this.Name = Name;
            this.Address = Address;
            this.phoneNum = phoneNum;
            this.ETA = ETA;

        }

    public String getETA(){
            return ETA;
    }
    public String getAddress(){
        return Address;
    }
    public String getPhoneNum(){
        return phoneNum;
    }

    void print(){
            System.out.println("---------------------------------------------");
            System.out.println("Please Confirm Your Delivery Info to Continue");
    }

    }

