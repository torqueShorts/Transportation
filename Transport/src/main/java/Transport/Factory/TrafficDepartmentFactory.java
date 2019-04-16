package Transport.Factory;

import Transport.Domain.TrafficDepartment;

public class TrafficDepartmentFactory {

    public static TrafficDepartment getTrafficDepartment(String address, String deptCode)
    {
        return new TrafficDepartment.TrafficDepartBuilder()
                .address(address)
                .deptCode(deptCode)
                .build();
    }




}
