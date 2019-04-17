package Transport.Domain;

public class Driver {

    private String driverID;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String vehLicense;
    private boolean international;

        private Driver()
            {

            }

            private Driver(DriverBuilder builder)
            {
                this.driverID = builder.driverID;
                this.name = builder.name;
                this.surname = builder.surname;
                this.dateOfBirth = builder.dateOfBirth;
                this.vehLicense = builder.vehLicense;
                this.international = builder.international;
            }


            public static class DriverBuilder {
                private String driverID;
                private String name;
                private String surname;
                private String dateOfBirth;
                private String vehLicense;
                private boolean international;

                public DriverBuilder driverID(String driverID) {
                    this.driverID = driverID;
                    return this;
                }

                public DriverBuilder name(String name) {
                    this.name = name;
                    return this;
                }

                public DriverBuilder surname(String surname) {
                    this.surname = surname;
                    return this;
                }

                public DriverBuilder dateOfBirth(String dateOfBirth) {
                    this.dateOfBirth = dateOfBirth;
                    return this;
                }

                public DriverBuilder vehLicense(String vehLicense) {
                    this.vehLicense = vehLicense;
                    return this;
                }

                public DriverBuilder international(boolean international)
                {
                    this.international = international;
                    return this;
                }

                public Driver build() {
                    return new Driver(this);
                }



                @Override

                public String toString() {
                    return "Driver {" + "\n Drive ID = " + driverID + "\n Driver name: " + name + "\n Driver surname: " + surname + "\n" +
                            " Driver DOB: " + dateOfBirth + "\n Vehicle license: " + vehLicense + "\n International ID:  " +international +"} ";
                }
    }






}
