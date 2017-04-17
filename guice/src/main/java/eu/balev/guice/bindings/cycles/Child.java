package eu.balev.guice.bindings.cycles;

interface Child
{
    public Mother getMother();
    
    public void saySomething();
    
    public boolean isHappy();
}
