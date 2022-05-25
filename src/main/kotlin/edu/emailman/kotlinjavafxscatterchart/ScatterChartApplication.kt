package edu.emailman.kotlinjavafxscatterchart

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.chart.NumberAxis
import javafx.scene.chart.ScatterChart
import javafx.scene.chart.XYChart
import javafx.scene.layout.Pane
import javafx.stage.Stage

class ScatterChartApplication : Application() {
    override fun start(stage: Stage) {
        // Create x-axis and y-axis
        val xAxis = NumberAxis(0.0, 8.0, 1.0)
        xAxis.label = "Number of Team Members"
        xAxis.minorTickCount = 0

        val yAxis = NumberAxis()
        yAxis.label = "Hours to Complete Task"

        // Create scatter chart
        val scatterChart = ScatterChart(xAxis, yAxis)
        scatterChart.title = "Time to Complete Task vs Number on Team"

        // Create a data series
        val dataSeries = XYChart.Series<Number, Number>()
        dataSeries.name = "Time for a Team to Complete a Task"
        dataSeries.data.add((XYChart.Data(1, 6.5)))
        dataSeries.data.add((XYChart.Data(2, 3.8)))
        dataSeries.data.add((XYChart.Data(3, 2.9)))
        dataSeries.data.add((XYChart.Data(4, 2.0)))
        dataSeries.data.add((XYChart.Data(5, 2.5)))
        dataSeries.data.add((XYChart.Data(6, 3.9)))
        dataSeries.data.add((XYChart.Data(7, 6.8)))

        // Add the data series to the chart
        scatterChart.data.add(dataSeries)

        // Create a pane and add the scatter chart to it
        val pane = Pane()
        pane.children.add(scatterChart)

        val scene = Scene(pane, 500.0, 500.0)

        // Add the scene to the stage
        stage.title = "Scatter Chart Demo"
        stage.scene = scene

        stage.show()
    }
}

fun main() {
    Application.launch(ScatterChartApplication::class.java)
}