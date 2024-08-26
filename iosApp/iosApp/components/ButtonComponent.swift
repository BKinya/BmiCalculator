import SwiftUI

struct ButtonComponent: View{
    let backgroundColor: Color
    let buttonText: String
    let textColor: Color = .white
    
    var clickAction : () -> Void
    
    var body: some View{
        Button(action: {
            clickAction()
        }){
            Text(buttonText)
                .frame(maxWidth: .infinity)
                .font(.system(size: 27, weight: .bold))
                .padding(14)
                .background(backgroundColor)
                .foregroundColor(textColor)
                
        }
            .buttonStyle(.plain)
            
        
    }
}

