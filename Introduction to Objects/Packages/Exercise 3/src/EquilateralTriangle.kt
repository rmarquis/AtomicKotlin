// Packages/EquilateralTriangle.kt
package pythagorean

import java.lang.Math.sqrt

class EquilateralTriangle(val side: Double) {
    fun area() = sqrt(3.0) / 4 * side * side
}