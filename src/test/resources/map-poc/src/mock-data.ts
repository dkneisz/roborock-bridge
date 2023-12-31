import {Path, Position, VirtualWalls} from "./types.ts";

export const mock_map_data = "data:image/png;base64,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"
export const mock_path: Path = [{"x": 185.8, "y": 122.88}, {"x": 185.8, "y": 122.86}, {"x": 185.78, "y": 122.9}, {
    "x": 186.28,
    "y": 123.7
}, {"x": 186.46, "y": 123.1}, {"x": 186.56, "y": 122.82}, {"x": 186.58, "y": 122.84}, {
    "x": 186.28,
    "y": 122.94
}, {"x": 186.18, "y": 122.92}, {"x": 186.18, "y": 122.9}, {"x": 186.16, "y": 122.92}, {
    "x": 186.18,
    "y": 122.92
}, {"x": 186.18, "y": 122.92}, {"x": 186.16, "y": 122.18}, {"x": 186.12, "y": 120.88}, {
    "x": 186.08,
    "y": 119.68
}, {"x": 186.04, "y": 118.48}, {"x": 186.04, "y": 117.4}, {"x": 186.08, "y": 116.4}, {
    "x": 186.14,
    "y": 115.56
}, {"x": 186.18, "y": 114.94}, {"x": 186.18, "y": 114.5}, {"x": 186.2, "y": 113.84}, {"x": 186.18, "y": 113.4}]
export const mock_robot_position: Position = {"x": 186.28, "y": 109.68, "a": 91}
export const mock_charger_position: Position = {"x": 186.28, "y": 109.68, "a": 91}
export const mock_virtual_walls: VirtualWalls = [[{"x":277.28,"y":217.3},{"x":278.36,"y":89.3}],[{"x":58.4,"y":283.72},{"x":135.84,"y":283.78}],[{"x":176.42,"y":264.42},{"x":223.82,"y":264.42}],[{"x":119.72,"y":244.88},{"x":138.68,"y":244.88}],[{"x":119.68,"y":245.22},{"x":119.48,"y":263.3}]]