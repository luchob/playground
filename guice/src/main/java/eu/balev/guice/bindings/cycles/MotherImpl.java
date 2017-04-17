package eu.balev.guice.bindings.cycles;

import javax.inject.Inject;

class MotherImpl implements Mother
{
    private Child child;

    @Inject
    MotherImpl(Child child)
    {        
        this.child = child;
    }

    @Override
    public Child getChild()
    {
        return child;
    }

    @Override
    public String giveAdvice()
    {

        if (child.isHappy())
        {
            return "Happy children grow up healthy!";
        }
        else
        {
            return "Unhappy children become aggressive!";
        }
        
        
    }

}
