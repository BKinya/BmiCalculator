import SwiftUI

struct BoxComponent<Content: View>: View{
    var backgrounColor: Color
    var content: Content
    var cornerRadius: CGFloat = 16
    var paddingValues: CGFloat = 12
    
    
    var body: some View{
        content
            .background(backgrounColor)
            .cornerRadius(cornerRadius)
            .padding(paddingValues)
    }
}

