<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Resister</title>
   
    <!-- Link -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
<link rel="stylesheet" href="/resources/assets/css/basic.css">
<link rel="stylesheet" href="/resources/assets/css/main.css">

</head>
<body>
    
   <section class="insert-section">
      <div class="container">
         <div class="row justify-content-center">
            <div class="col-md-6 col-lg-5">
               <div class="insert-wrap">
                  <img src="/resources/assets/images/cucumber.png">
                  <h3 class="mb-4 text-center">상품 등록</h3>
                  <form action="boardRegister.do" method="post" class="insert-form" enctype="multipart/form-data">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="제목" required name="bo_title">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="가격" required name="bo_price">
                    </div>
                    <div class="form-group">
                        <textarea rows="5" cols="20" class="form-control" placeholder="내용" required name="bo_content"></textarea>
                    </div>
                    <div class="form-group filebox bs3-primary preview-image">
                        <input class="upload-name" value="파일선택" disabled="disabled" style="width: 250px;">

                        <label for="input-file1" class="input-file-button"><img src="/resources/assets/images/paper-clip.png"></label>
                        <input type="file" multiple="multiple" id="input-file1" class="upload-hidden" name="bo_image1">
                    </div>
                <!--     <div class="form-group filebox bs3-primary preview-image">
                        <input class="upload-name" value="파일선택" disabled="disabled" style="width: 250px;">

                        <label for="input-file2" class="input-file-button"><img src="/resources/assets/images/paper-clip.png"></label>
                        <input type="file" id="input-file2" class="upload-hidden" name="bo_image2">
                    </div>
                    <div class="form-group filebox bs3-primary preview-image">
                        <input class="upload-name" value="파일선택" disabled="disabled" style="width: 250px;">

                        <label for="input-file3" class="input-file-button"><img src="/resources/assets/images/paper-clip.png"></label>
                        <input type="file" id="input-file3" class="upload-hidden" name="bo_image3">
                    </div> -->

                    <input type="hidden" name="bo_address1" value="adress1"> 
                    <input type="hidden" name="bo_address2" value="adress2"> 
                    <input type="hidden" name="bo_id" value="test1"> 
                    <input type="hidden" name="bo_nickname" value="겸둥이">
                     
                    <div class="form-group submit">
                        <button type="submit" class="form-control btn btn-primary">등록하기</button> 
                        <br><br>
                        <button type="reset" class="form-control btn btn-primary">취소</button>
                    </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </section>

   <!-- jQuery -->
   <script src="/resources/assets/js/jquery-2.1.0.min.js"></script>
   <!-- Bootstrap -->
   <script src="/resources/assets/js/bootstrap.min.js"></script>
   <!-- Plugins -->
   <script src="/resources/assets/js/owl-carousel.js"></script>
   <script src="/resources/assets/js/slick.js"></script>
   <!-- custom -->
   <script src="/resources/assets/js/custom.js"></script>
   <script type="text/javascript">
    $(document).ready(function(){
   var fileTarget = $('.filebox .upload-hidden');

    fileTarget.on('change', function(){
        if(window.FileReader){
            // 파일명 추출
            var filename = $(this)[0].files[0].name;
        } 

        else {
            // Old IE 파일명 추출
            var filename = $(this).val().split('/').pop().split('\\').pop();
        };

        $(this).siblings('.upload-name').val(filename);
    });

    //preview image 
    var imgTarget = $('.preview-image .upload-hidden');

    imgTarget.on('change', function(){
        var parent = $(this).parent();
        parent.children('.upload-display').remove();

        if(window.FileReader){
            //image 파일만
            if (!$(this)[0].files[0].type.match(/image\//)) return;
            
            var reader = new FileReader();
            reader.onload = function(e){
                var src = e.target.result;
                parent.prepend('<div class="upload-display"><div class="upload-thumb-wrap"><img src="'+src+'" class="upload-thumb"></div></div>');
            }
            reader.readAsDataURL($(this)[0].files[0]);
        }

        else {
            $(this)[0].select();
            $(this)[0].blur();
            var imgSrc = document.selection.createRange().text;
            parent.prepend('<div class="upload-display"><div class="upload-thumb-wrap"><img class="upload-thumb"></div></div>');

            var img = $(this).siblings('.upload-display').find('img');
            img[0].style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(enable='true',sizingMethod='scale',src=\""+imgSrc+"\")";        
        }
    });
});
</script>

</body>
</html>