package eu.balev.guice.bindings.cycles;

import javax.inject.Inject;

class ChildImpl implements Child
{
    private final Mother mother;

    @Inject
    ChildImpl(Mother mother)
    {
        this.mother = mother;
    }

    @Override
    public Mother getMother()
    {
        return mother;
    }

    @Override
    public void saySomething()
    {
        String words = isHappy() ? "I'm happy" : "I'm unhappy!";
        System.out.println(words);
    }

    @Override
    public boolean isHappy()
    {
        return getMother() != null;
    }

}
