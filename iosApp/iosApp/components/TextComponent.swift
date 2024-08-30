import SwiftUI

struct TitleComponent: View {
    var label: String = "BMI Calculator"
    var body: some View {
        Text(label)
            .foregroundColor(.white)
            .font(.title)
            .bold()
    }
}


struct BigTextComponent: View {
    var text: String = "Your Result"
    var fontSize: CGFloat = 53.0
    var body: some View {
        Text(text)
            .foregroundColor(.white)
            .font(.system(size: fontSize, weight: .bold))
           
    }
}

struct RegularTextComponent: View {
    var text: String = "Some Text"
    var fontSize: CGFloat = 24.0
    var textColor: Color = smokeWhite
    var body: some View {
        Text(text)
            .font(.system(size: fontSize, weight: .regular))
            .foregroundColor(textColor)
            .padding()
    }
}


struct BoldTextComponent: View {
    var text: String = "Some Text"
    var fontSize: CGFloat = 24.0
    var textColor: Color = smokeWhite
    var body: some View {
        Text(text)
            .font(.system(size: fontSize, weight: .bold))
            .foregroundColor(textColor)
    }
}


