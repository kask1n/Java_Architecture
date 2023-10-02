package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

import java.awt.*;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public java.awt.Color Color;
    public float Power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.Location = location;
        this.Angle = angle;
        this.Color = color;
        this.Power = power;
    }

    public void Rotate(Angle3D Angle) {
    }

    public void Move(Point3D Location) {
    }
}
