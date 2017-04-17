package eu.balev.guice.bindings.cycles;

interface Mother
{
    public Child getChild();
    
    public String giveAdvice();
}
