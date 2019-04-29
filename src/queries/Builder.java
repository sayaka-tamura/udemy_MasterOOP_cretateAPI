package queries;
public interface Builder {
    public void mustMatch(String key, String value);

    public void shouldMatch(String key, String value);

    // create the instances of the Musts, Shoulds etc.
    public void create();

    // print out the composed objects json format to prove that the API works as expected
    public void printAsJSONformat();

}