/*
 * The MIT License
 *
 * Copyright 2019 eliase.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package PBEngine.Rendering.core;

import JFUtils.point.Point2D;
import java.awt.Color;

/**
 *
 * @author Elias Eskelinen <elias.eskelinen@protonmail.com>e
 */
public class renderContainer implements java.io.Serializable{
    //int age;
    public Point2D location;
    public String ImageName;
    public Color color;
    public int size;
    public double rotation = 0;
    
    public renderType type = renderType.NaN;
    
    public renderContainer(Point2D location, String ImageName, Color color, int size, renderType t, double rotation){
        this.location = location;
        this.ImageName = ImageName;
        this.color = color;
        this.size = size;
        this.rotation = rotation;
        this.type = t;
    }
}
