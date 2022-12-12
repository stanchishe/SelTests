package org.example;
import org.junit.jupiter.api.*;

// Примерни тестове
class ShapesClassTests {
    @Nested
    @DisplayName("When shape has already been created")
    class WhenShapeExists {
        private final ShapesClass square = new ShapesClass(4, "Square");

        @Nested
        @DisplayName("Success paths")
        class SuccessPaths {

            @Test
            @DisplayName("Should check the number of sides")
            void shouldCheckTheNumberOfSides() {
                Assertions.assertEquals(4, square.getNumberOfSides());
            }

            @Test
            @DisplayName("Should check description")
            void shouldCheckDescription() {
                Assertions.assertEquals("Square", square.getShapeName());
            }
        }

        @Nested
        @DisplayName("Fail paths")
        class FailPaths {
            @Test
            @DisplayName("Should not be the same shape")
            void shouldNotBeTheSameShape() {
                Assertions.assertNotEquals(new ShapesClass(4), square);
            }
        }
    }

    @Nested
    @DisplayName("Test exception handling")
    class ExceptionHandling {

        @Test
        @DisplayName("should test circle creation")
        void shouldTestCircleCreation () {
            ShapesClass circle = new ShapesClass(Integer.MAX_VALUE, "Circle");
            Assertions.assertEquals("Circle", circle.getShapeName());
        }

        @Test
        @DisplayName("should not create a shape with max int when not circle")
        void shouldFailWithMaxInt () {
            Assertions.assertThrows(
                    IllegalArgumentException.class, () -> new ShapesClass(Integer.MAX_VALUE, "notCircle"));
        }

        @Test
        @DisplayName("should not create a shape with less than 3 sides")
        void shouldFailWithLessThanThreeSides () {
            Assertions.assertThrows(
                    IllegalArgumentException.class, () -> new ShapesClass(1));
        }
    }
}
