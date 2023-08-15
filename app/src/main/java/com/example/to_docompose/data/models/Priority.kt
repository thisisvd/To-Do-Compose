package com.example.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import com.example.to_docompose.ui.theme.highPriorityColor
import com.example.to_docompose.ui.theme.lowPriorityColor
import com.example.to_docompose.ui.theme.mediumPriorityColor
import com.example.to_docompose.ui.theme.nonePriorityColor

enum class Priority(val color: Color) {
    HIGH(highPriorityColor),
    MEDIUM(mediumPriorityColor),
    LOW(lowPriorityColor),
    NONE(nonePriorityColor)
}