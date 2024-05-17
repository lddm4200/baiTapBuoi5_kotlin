package com.example.baitapbuoi5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.compose.AsyncImage

class baiTapBuoi5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetLayout()
        }
    }
}

@Preview
@Composable
fun GetLayout (title: String = "Trang chu") {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ){
        GetTextTitle(title = title)

        GetRowItem(color = Color.Cyan, "https://rgb.vn/wp-content/uploads/2014/05/rgb_vn_new_branding_paypal_2014_logo_detail.png", "paypal")
        GetRowItem(color = Color.White, "https://logowik.com/content/uploads/images/visa-payment-card1873.jpg", "visa")
        GetRowItem(color = Color.Magenta, "https://developers.momo.vn/v3/vi/assets/images/square-8c08a00f550e40a2efafea4a005b1232.png", "momo")
        GetRowItem(color = Color.Blue, "https://cdn.haitrieu.com/wp-content/uploads/2022/10/Logo-ZaloPay-Square.png", "zalo pay")
    }
}

@Composable
fun GetRowItem (color: Color, linkImage: String, noidungtext: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(5.dp)
            .background(color = color, shape = RoundedCornerShape(20.dp))
            .height(50.dp)
            .fillMaxWidth()
    ) {


        AsyncImage(
            model = linkImage,
            modifier = Modifier
                .width(60.dp)
                .padding(5.dp),
            contentDescription = null
        )

        Text(
            text = noidungtext,
            modifier = Modifier
                .weight(1f)
                .padding(50.dp, 0.dp, 0.dp, 0.dp),
            color = Color.White
        )

        RadioButton(selected = false, onClick = { /*TODO*/ })
    }
}



@Composable
fun GetTextTitle (title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        fontSize = 30.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}