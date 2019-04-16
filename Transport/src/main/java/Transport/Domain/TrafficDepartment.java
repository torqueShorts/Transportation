package Transport.Domain;

public class TrafficDepartment {

    private String address;
    private String deptCode;

    private TrafficDepartment()
    {

    }

    private TrafficDepartment(TrafficDepartBuilder builder)
    {
        this.address = builder.address;
        this.deptCode = builder.deptCode;
    }

    public String getAddress()
    {
        return address;
    }

    public String getDeptCode()
    {
        return deptCode;
    }

    public static class TrafficDepartBuilder
    {
        private String address;
        private String deptCode;

        public TrafficDepartBuilder address(String address)
        {
            this.address = address;
            return this;
        }

        public TrafficDepartBuilder deptCode(String deptCode)
        {
            this.deptCode = deptCode;
            return this;
        }

        public TrafficDepartment build()
        {
            return new TrafficDepartment(this);
        }





    }






}
