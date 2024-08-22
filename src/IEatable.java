public interface IEatable {
        String getFoodInfo();
        default String isEatable() {
            return "This food is eatable.";
        }
    }

