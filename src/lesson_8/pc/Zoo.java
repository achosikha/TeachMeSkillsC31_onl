package lesson_8.pc;

import lesson_8.pc.zooanimals.Animals;
import lesson_8.pc.zooinfrastructure.Infrastructure;
import lesson_8.pc.zoostaff.Staff;

public class Zoo {
    // Composition, has-connection
    private Animals zooAnimals;
    private Infrastructure zooInfrastructure;
    private Staff zooStaff;

    Zoo(Animals zooAnimals, Infrastructure zooInfrastructure, Staff zooStaff){
        this.zooAnimals = zooAnimals;
        this.zooInfrastructure = zooInfrastructure;
        this.zooStaff = zooStaff;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooAnimals=" + this.zooAnimals +
                ", zooInfrastructure=" + this.zooInfrastructure +
                ", zooStaff=" + this.zooStaff +
                '}';
    }
}
